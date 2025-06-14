import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import WeldPage from './pages/WeldPage';
import TorchPage from './pages/TorchPage';

const App = () => {
  return (
    <Router>
      <nav>
        <Link to="/welds">Сварочные аппараты</Link> | <Link to="/torches">Горелки</Link>
      </nav>
      <Routes>
        <Route path="/welds" element={<WeldPage />} />
        <Route path="/torches" element={<TorchPage />} />
      </Routes>
    </Router>
  );
};

export default App;

