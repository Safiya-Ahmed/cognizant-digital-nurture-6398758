import React from "react";
import "./App.css";

function App() {
  const officeList = [
  {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai",
    Image: "https://officebanao.com/wp-content/uploads/2024/03/modern-office-room-with-white-walls.webp"
  },
  {
    Name: "Regus",
    Rent: 75000,
    Address: "Bangalore",
    Image: "https://officesnapshots.com/wp-content/uploads/2015/11/20150725-DSC_5085tifftiff-1024x683.jpg"
  },
  {
    Name: "WeWork",
    Rent: 60000,
    Address: "Mumbai",
    Image: "https://static.wixstatic.com/media/adfb53_013ec2eea6404aae9fd4ac20cca4b299~mv2.jpg/v1/fill/w_1280,h_678,al_c,q_85,enc_avif,quality_auto/adfb53_013ec2eea6404aae9fd4ac20cca4b299~mv2.jpg"
  }
];


  return (
    <div className="App">
      <h1>Office Space , at Affordable Range</h1>

      {officeList.map((office, index) => {
        const rentStyle = {
          color: office.Rent <= 60000 ? "red" : "green"
        };

        return (
          <div key={index} style={{ border: "1px solid #ccc", padding: "10px", margin: "10px" }}>
            <img src={office.Image} alt={office.Name} width="300" height="200" />
            <h2>Name: {office.Name}</h2>
            <h3 style={rentStyle}>Rent: Rs. {office.Rent}</h3>
            <h3>Address: {office.Address}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default App;
