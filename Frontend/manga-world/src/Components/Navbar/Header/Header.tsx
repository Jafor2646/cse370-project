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
          <button className="p-1 border-white border-2 rounded-lg hover:bg-white hover:text-black hover:border-teal-500 active:bg-gray-500 font-bold me-2">
            Login
          </button>
          <button className="p-1 border-white border-2 rounded-lg hover:bg-white hover:text-black hover:border-teal-500 active:bg-gray-500 font-bold">
            Sign Up
          </button>
        </div>
      </div>
    </>
  );
}

export default Header;
