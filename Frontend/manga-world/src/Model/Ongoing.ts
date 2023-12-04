import Chapter from "./Chapter";
import Manga from "./Manga";
import Volume from "./Volume";
import User from "./User";

class Ongoing {
    userId: number;
    mid: number;
    currentVolume: number;
    currentChapter: number;
    user: User;
    manga: Manga;
    volume: Volume;
    chapter: Chapter;

    constructor(userId: number, mid: number, currentVolume: number, currentChapter: number, user: User, manga: Manga, volume: Volume, chapter: Chapter) {
        this.userId = userId;
        this.mid = mid;
        this.currentVolume = currentVolume;
        this.currentChapter = currentChapter;
        this.user = user;
        this.manga = manga;
        this.volume = volume;
        this.chapter = chapter;
    }
}

export default Ongoing;