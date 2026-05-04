import React from "react";

const ButtonGrid = ({ buttons, handleClick }) => {
  return (
    <div className="grid">
      {buttons.map((btn, index) => (
        <button
          key={index}
          onClick={() => handleClick(index)}
          disabled={btn.disabled}
          className={`btn ${btn.disabled ? "disabled" : ""}`}
          style={{ backgroundColor: btn.color }}
        >
          {btn.disabled ? "Done" : "Click"}
        </button>
      ))}
    </div>
  );
};

export default ButtonGrid;