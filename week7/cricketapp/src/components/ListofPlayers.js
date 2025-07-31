import React from 'react';

function ListofPlayers({ players }) {
  return (
    <ul>
      {players.map((item, index) => (
        <li key={index}>
          Mr. {item.name} <span>{item.score}</span>
        </li>
      ))}
    </ul>
  );
}

export default ListofPlayers;

