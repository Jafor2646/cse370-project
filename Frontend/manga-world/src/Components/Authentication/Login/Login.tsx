import React, { useState } from "react";
import "./Login.css";
import { Link } from "react-router-dom";

function Login() {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [rememberPassword, setRememberPassword] = useState(false); // Add state for remember password checkbox
  const [emailError, setEmailError] = useState("");
  const [passwordError, setPasswordError] = useState("");

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

  const handleRememberPasswordChange = () => {
    setRememberPassword(!rememberPassword);
  };

  const handleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();
    // Handle login logic here
  };

  return (
    <div className="background_image_login">
      <div className="flex justify-center items-center h-screen">
        <form
          onSubmit={handleSubmit}
          className="bg-gray-950 text-white shadow-md rounded px-8 py-8 mb-4"
        >
          <h2 className="text-2xl font-bold mb-6">Log In</h2>
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
          <div className="mb-6">
            <label className="text-white text-sm font-bold mb-2 flex items-center">
              <input
                className="mr-2"
                type="checkbox"
                checked={rememberPassword}
                onChange={handleRememberPasswordChange}
              />
              <span>Remember Password</span>
            </label>
          </div>
          <div className="flex items-center justify-center">
            <button
              className="bg-white hover:bg-gray-300 text-black font-bold py-2 px-8 rounded focus:outline-none focus:shadow-outline mb-5"
              type="submit"
            >
              Log In
            </button>
          </div>
          <div>
            <Link to="/signup" className="text-white text-sm font-bold mb-2">
              Or, Create New Account
            </Link>
          </div>
        </form>
      </div>
    </div>
  );
}

export default Login;
