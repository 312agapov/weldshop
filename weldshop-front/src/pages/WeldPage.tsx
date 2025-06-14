import { useEffect, useState } from 'react';
import axios from 'axios';

export type PowerSupplyType = 
  | 'VOLTAGE220' 
  | 'VOLTAGE220_380' 
  | 'VOLTAGE380';

export type WeldType =
  | 'TRANSFORMATOR'
  | 'VYPRYAMITEL'
  | 'INVERTOR'
  | 'POLYAVTOMAT';

export type WeldWorkType =
  | 'TIG'
  | 'GAS'
  | 'SPOT'
  | 'MAG'
  | 'MMA'
  | 'MIG'
  | 'MIG_MAG';

export type Welder = {
  id: string;
  name: string;
  description: string;
  price: number;
  minAmperage: number;
  maxAmperage: number;
  powerSupplyType: PowerSupplyType;
  weldType: WeldType;
  weldWorkType: WeldWorkType[];
};

const WeldPage = () => {
  const [welders, setWelders] = useState<Welder[]>([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    axios.get<Welder[]>('http://localhost:8080/api/welds')
      .then(response => {
        setWelders(response.data);
        setLoading(false);
      })
      .catch(error => {
        console.error('Ошибка загрузки данных:', error);
        setLoading(false);
      });
  }, []);

  return (
    <div>
      <h1>Сварочники</h1>
      <ul>
        {welders.map(w => (
          <div key={w.id}>
            {w.name} <br />
            {w.price} р. <br />
            Макс. ток - {w.maxAmperage}A
            <br />Питается от {w.powerSupplyType}
          </div>
        ))}
      </ul>
    </div>
  );
};

export default WeldPage;