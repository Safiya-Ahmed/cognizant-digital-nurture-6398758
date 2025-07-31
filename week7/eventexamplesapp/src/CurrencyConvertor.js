import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleSubmit = () => {
    if (currency === 'euro') {
      const converted = (parseFloat(amount) / 80).toFixed(2); // Rs to Euro
      alert(`Converting Rs. ${amount} to Euro: €${converted}`);
    } else {
      alert('Please enter "euro" in the currency field.');
    }
  };

  return (
    <div>
      <h3 style={{ color: "green" }}>Currency Convertor!!!</h3>
      <input
        type="text"
        placeholder="Amount"
        value={amount}
        onChange={(e) => setAmount(e.target.value)}
      />
      <input
        type="text"
        placeholder="Currency"
        value={currency}
        onChange={(e) => setCurrency(e.target.value.toLowerCase())}
      />
      <button onClick={handleSubmit}>Submit</button>
    </div>
  );
}

export default CurrencyConvertor;
