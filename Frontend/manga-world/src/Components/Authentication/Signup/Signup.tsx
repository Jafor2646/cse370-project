import React, { useState } from "react";
import "./Signup.css";
import { Link } from "react-router-dom";

function Signup() {
  const [email, setEmail] = useState("");
  const [name, setName] = useState("");
  const [password, setPassword] = useState("");
  const [emailError, setEmailError] = useState("");
  const [passwordError, setPasswordError] = useState("");
  const [nameError, setNameError] = useState("");

  const handleEmailChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    const inputEmail = e.target.value;
    setEmail(inputEmail);

    // Email validation regex pattern
    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (!emailPattern.test(inputEmail)) {
      setEmailError("Please enter a valid email address");
    } else {
      setEmailError("");
    }
  };

  const handleNameChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    const inputName = e.target.value;
    setName(inputName);

    // Name validation regex pattern
    const namePattern = /^[A-Za-z\d]{3,}$/

    if (!namePattern.test(inputName)) {
      setNameError("Name must be at least 3 characters");
    } else {
      setNameError("");
    }
  };

  const handlePasswordChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    const inputPassword = e.target.value;
    setPassword(inputPassword);

    // Password validation regex pattern
    const passwordPattern = /^[A-Za-z\d]{4,}$/
    ;

    if (!passwordPattern.test(inputPassword)) {
      setPasswordError("Password must be at least 4 characters");
    } else {
      setPasswordError("");
    }
  };

  const handleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();
    // Perform signup logic here
  };

  return (
    <div className="flex justify-center items-center h-screen background_image_signup">
      <div className="bg-gray-950 text-white shadow-md rounded px-8 py-8 mb-4">
        <h2 className="text-2xl font-bold mb-6">Sign Up</h2>
        <form onSubmit={handleSubmit}>
          <div className="mb-6">
            <label
              className="block text-white text-sm font-bold mb-2"
              htmlFor="email"
            >
              Email
            </label>
            <input
              className="shadow appearance-none border rounded w-64 py-3 px-4 text-black leading-tight focus:outline-none focus:shadow-outline"
              id="email"
              type="email"
              placeholder="Enter your email"
              value={email}
              onChange={handleEmailChange}
            />
            {emailError && (
              <p className="text-red-500 text-xs italic">{emailError}</p>
            )}
          </div>
          <div className="mb-6">
            <label
              className="block text-white text-sm font-bold mb-2"
              htmlFor="name"
            >
              Name
            </label>
            <input
              className="shadow appearance-none border rounded w-64 py-3 px-4 text-black leading-tight focus:outline-none focus:shadow-outline"
              id="name"
              type="text"
              placeholder="Enter your name"
              value={name}
              onChange={handleNameChange}
            />
            {nameError && (
                <p className="text-red-500 text-xs italic">{nameError}</p>
            )}
          </div>
          <div className="mb-6">
            <label
              className="block text-white text-sm font-bold mb-2"
              htmlFor="password"
            >
              Password
            </label>
            <input
              className="shadow appearance-none border rounded w-64 py-3 px-4 text-black leading-tight focus:outline-none focus:shadow-outline"
              id="password"
              type="password"
              placeholder="Enter your password"
              value={password}
              onChange={handlePasswordChange}
            />
            {passwordError && (
                <p className="text-red-500 text-xs italic">{passwordError}</p>
            )}
          </div>
          <div className="flex items-center justify-center">
            <button
              className="bg-white hover:bg-gray-300 text-black font-bold py-2 px-8 rounded focus:outline-none focus:shadow-outline mb-5"
              type="submit"
            >
              Sign Up
            </button>
          </div>
          <div>
            <Link to="/login" className="text-white text-sm font-bold mb-2">
              Already have an account?
            </Link>
          </div>
        </form>
      </div>
    </div>
  );
}
export default Signup;
