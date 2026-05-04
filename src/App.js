import React, { useState } from "react";
import "./App.css";
import ButtonGrid from "./components/ButtonGrid";

function App() {
  const colors = ["#FF4C4C", "#4C6FFF", "#28C76F", "#FFE700", "#FF9F43", "#9C27B0"];

  const createButtons = () =>
    Array.from({ length: 9 }, () => ({
      color: "#e0e0e0",
      disabled: false,
    }));

  const [buttons, setButtons] = useState(createButtons);
  const [colorIndex, setColorIndex] = useState(0);

  const handleClick = (index) => {
    if (buttons[index].disabled) return;

    const updated = [...buttons];
    updated[index] = {
      color: colors[colorIndex % colors.length],
      disabled: true,
    };

    setButtons(updated);
    setColorIndex((prev) => prev + 1);
  };

  const handleReset = () => {
    setButtons(createButtons());
    setColorIndex(0);
  };

  return (
    <div className="container">
      <h1>Button Color Assignment</h1>

      <ButtonGrid buttons={buttons} handleClick={handleClick} />

      <button className="reset-btn" onClick={handleReset}>
        Reset
      </button>
    </div>
  );
}

export default App;