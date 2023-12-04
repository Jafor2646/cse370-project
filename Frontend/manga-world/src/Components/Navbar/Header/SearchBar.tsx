import {useEffect, useState} from "react";
import MangaController from "../../../Controller/MangaController";

function SearchBar() {
    const [inputPlaceholder, setInputPlaceholder] = useState<string>("Search for anime...");

    useEffect(() => {
        let placeholders = ["Hellsing", "The Disastrous Life of Saiki K.", "Vinland Saga"];

        MangaController.getAllMangaNames().then((res) => {
            placeholders = res.data;
        });

        let currentIndex = 0;
        let currentPlaceholder = "";

        const animatePlaceholders = () => {
            const targetPlaceholder = placeholders[currentIndex];
            let targetIndex = 0;

            const typingInterval = setInterval(() => {
                currentPlaceholder += targetPlaceholder[targetIndex];
                setInputPlaceholder(currentPlaceholder);
                targetIndex++;

                if (targetIndex === targetPlaceholder.length) {
                    clearInterval(typingInterval);
                    setTimeout(() => {
                        const deletingInterval = setInterval(() => {
                            currentPlaceholder = currentPlaceholder.slice(0, -1);
                            setInputPlaceholder(currentPlaceholder);

                            if (currentPlaceholder === "") {
                                clearInterval(deletingInterval);
                                currentIndex = (currentIndex + 1) % placeholders.length;
                                setTimeout(animatePlaceholders, 1000);
                            }
                        }, 100);
                    }, 1000);
                }
            }, 100);
        };
        animatePlaceholders();
    }, []);

    return (
        <>
            <div className="ms-20 flex-grow">
                <input
                    type="text"
                    placeholder={inputPlaceholder}
                    className="w-full text-black border-white border-2 rounded-lg p-1 hover:bg-white hover:text-black hover:border-teal-500 active:bg-gray-500 font-bold"
                />
            </div>
            <button
                className="bg-white hover:bg-gray-300 text-black font-bold py-1.5 px-2 rounded-lg focus:outline-none focus:shadow-outline me-20 ms-1">
                Search
            </button>
        </>
    );
}

export default SearchBar;
