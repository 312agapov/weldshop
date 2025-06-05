import { useEffect, useState } from 'react';
import axios from 'axios';

type Weld = {
  id?: string;
  name: string;
  description: string;
  price: number;
  minAmperage: number;
  maxAmperage: number;
  powerSupplyType: string;
  weldType: string;
  weldWorkType: string[];
};

const API_URL = 'http://localhost:8080/api/welds';

export default function WeldPage() {
  const [welds, setWelds] = useState<Weld[]>([]);
  const [newWeld, setNewWeld] = useState<Weld>({
    name: '',
    description: '',
    price: 0,
    minAmperage: 0,
    maxAmperage: 200,
    powerSupplyType: 'VOLTAGE220',
    weldType: 'INVERTOR',
    weldWorkType: ['MIG','MAG'],
  });

  const loadWelds = async () => {
    const response = await axios.get(API_URL);
    setWelds(response.data);
  };

  useEffect(() => {
    loadWelds();
  }, []);

  const handleAdd = async () => {
    await axios.post(API_URL, newWeld);
    await loadWelds();
  };

  const handleDelete = async (id: string) => {
    await axios.delete(`${API_URL}/${id}`);
    await loadWelds();
  };

  return (
    <div style={{ padding: 20 }}>
      <h1>Сварки</h1>

      <div style={{ marginBottom: 20 }}>
        <input
          placeholder="Название"
          value={newWeld.name}
          onChange={(e) => setNewWeld({ ...newWeld, name: e.target.value })}
        />
        <input
          placeholder="Описание"
          value={newWeld.description}
          onChange={(e) => setNewWeld({ ...newWeld, description: e.target.value })}
        />
        <input
          type="number"
          placeholder="Цена"
          value={newWeld.price}
          onChange={(e) => setNewWeld({ ...newWeld, price: Number(e.target.value) })}
        />
        <button onClick={handleAdd}>Добавить</button>
      </div>

      <ul>
        {welds.map((weld) => (
          <li key={weld.id}>
            <strong>{weld.name}</strong>: {weld.description} — {weld.price}₽
            <button onClick={() => handleDelete(weld.id!)}>Удалить</button>
          </li>
        ))}
      </ul>
    </div>
  );
}