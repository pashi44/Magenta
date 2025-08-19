import React, { useState } from 'react';

export default function App() {
  const [state, setState] = useState<string[]>([]);

  const handleClick = () => {
    setState(prev => [...prev, "pashi"]);
  };

  return (
    <div className="App">
      <h1>Hello</h1>
      <button onClick={handleClick}>Add Name</button>
      <ul>
        {state.map((item, index) => (
          <li key={index}>{item}</li>
        ))}
      </ul>
    </div>
  );
}
