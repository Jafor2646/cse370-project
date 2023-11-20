import { useState } from "react";
import SearchBar from "./SearchBar";

function Header() {
  const [logoSrc, setLogoSrc] = useState<string>(
    require("./../../../Assets/Images/Icons/Logos/wt-tns-logo.png")
  );

  return (
    <>
      <div className="flex bg-black text-white text-2xl items-center justify-between mx-auto">
        <div className="flex items-center">
          <img
            src={logoSrc}
            alt="Anime World Logo"
            className="w-16 p-1 hover:cursor-pointer"
            onMouseOver={() => {
              setLogoSrc(
                require("./../../../Assets/Images/Icons/Logos/hover-logo.png")
              );
            }}
            onMouseDown={() => {
              setLogoSrc(
                require("../../../Assets/Images/Icons/Logos/active-logo.png")
              );
            }}
            onMouseUp={() => {
              setLogoSrc(
                require("../../../Assets/Images/Icons/Logos/hover-logo.png")
              );
            }}
            onBlur={() => {
              setLogoSrc(
                require("../../../Assets/Images/Icons/Logos/wt-tns-logo.png")
              );
            }}
            onMouseOut={() => {
              setLogoSrc(
                require("../../../Assets/Images/Icons/Logos/wt-tns-logo.png")
              );
            }}
          />
          <p className="font-bold text-3xl pl-1">Manga World</p>
        </div>

        <SearchBar />

        <div>
          <button className="bg-white hover:bg-gray-300 text-black font-bold py-1.5 px-2 rounded focus:outline-none focus:shadow-outline me-1">
            Login
          </button>
          <button className="bg-white hover:bg-gray-300 text-black font-bold py-1.5 px-2 rounded focus:outline-none focus:shadow-outline me-1">
            Sign Up
          </button>
        </div>
      </div>
    </>
  );
}

export default Header;
