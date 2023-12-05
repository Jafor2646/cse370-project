import { createBrowserRouter, RouterProvider } from "react-router-dom";
import "./App.css";
import RoutingPage from "./Components/RoutingPage";
import Homepage from "./Components/Homepage/Homepage";
import Login from "./Components/Authentication/Login/Login";
import Signup from "./Components/Authentication/Signup/Signup";
import {useEffect, useState} from "react";
import Cookies from "js-cookie";
import {Auth} from "./Auth/Auth";
import ErrorPage from "./Components/ErrorPage/ErrorPage";
import CategoryViewer from "./Components/CategoryViewer/CategoryViewer";
import MangaViewer from "./Components/MangaViewer/MangaViewer";
import AuthorViewer from "./Components/AuthorViewer/AuthorViewer";

const router = createBrowserRouter([
  {
    path: "/",
    element: <RoutingPage />,
    children: [
      { path: "/", element: <Homepage/> },
      { path: "/home", element: <Homepage/> },
      { path: "/login", element: <Login/> },
      { path: "/signup", element: <Signup/> },
      { path: "*", element: <ErrorPage/> },
      { path: "/category", element: <CategoryViewer/> },
      { path: "/manga", element: <MangaViewer/> },
      { path: "/author", element: <AuthorViewer/> },
    ],
  },
]);

function App() {
  const [authorised, setAuthorised] = useState(() => Cookies.get("authorised") || "false");
  const [userId, setUserId] = useState(() => Cookies.get("userId") || "");
  const [userType, setUserType] = useState(() => Cookies.get("userType") || "");

  useEffect(() => {
    Cookies.set("authorised", authorised);
    Cookies.set("userId", userId);
    Cookies.set("userType", userType);
  }, [authorised, userId, userType]);
  return (
      <Auth.Provider
          value={{
            authorised,
            setAuthorised,
            userId,
            setUserId,
            userType,
            setUserType
          }}
      >
      <RouterProvider router={router}></RouterProvider>
      </Auth.Provider>
  );
}

export default App;
