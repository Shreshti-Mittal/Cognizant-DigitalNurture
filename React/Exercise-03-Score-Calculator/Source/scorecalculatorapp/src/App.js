import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <CalculateScore
      name="Shreshti Mittal"
      school="GLA University"
      total={450}
      goal={500}
    />
  );
}

export default App;