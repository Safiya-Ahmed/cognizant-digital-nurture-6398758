import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [count, setCount] = useState(0);

  const handleIncrement = () => {
    setCount(count + 1);
    sayHello(); // Also alerts "Hello member"
  };

  const handleDecrement = () => {
    setCount(count - 1);
  };

  const sayHello = () => {
    alert("Hello member");
  };

  const sayWelcome = (msg) => {
    alert(msg); // Shows alert with custom message like "Welcome"
  };

  const handleSyntheticEvent = (e) => {
    alert("I was clicked");
    console.log("SyntheticEvent:", e);
  };

  return (
    <div>
      <h2>Counter: {count}</h2>

      {/* Step 2 Buttons */}
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={handleDecrement}>Decrement</button>

      {/* Step 3 Button */}
      <button onClick={() => sayWelcome("Welcome")}>Say Welcome</button>

      {/* Step 4 Button */}
      <button onClick={handleSyntheticEvent}>Click on me</button>

      {/* Currency Converter Component */}
      <CurrencyConvertor />
    </div>
  );
}

export default App;
