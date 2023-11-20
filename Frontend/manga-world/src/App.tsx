import { createBrowserRouter, RouterProvider } from "react-router-dom";
import "./App.css";
import RoutingPage from "./Components/RoutingPage";
import Homepage from "./Components/Homepage/Homepage";
import Login from "./Components/Authentication/Login/Login";
import Signup from "./Components/Authentication/Signup/Signup";

const router = createBrowserRouter([
  {
    path: "/",
    element: <RoutingPage />,
    children: [
      { path: "/", element: <Homepage/> },
      { path: "/home", element: <Homepage/> },
      { path: "/login", element: <Login/> },
      { path: "/signup", element: <Signup/> },
    ],
  },
]);

function App() {
  return (
      <RouterProvider router={router}></RouterProvider>
  );
}

export default App;
