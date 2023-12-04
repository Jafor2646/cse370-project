import Chapter from "./Chapter";
import Manga from "./Manga";
import User from "./user";
import Volume from "./Volume";

class ongoing {
    userId: number;
    mId: number;
    currentVolume: number;
    currentChapter: number;
    user: User;
    manga: Manga;
    volume: Volume;
    chapter: Chapter;

    constructor(userId: number, mId: number, currentVolume: number, currentChapter: number, user: User, manga: Manga, volume: Volume, chapter: Chapter) {
        this.userId = userId;
        this.mId = mId;
        this.currentVolume = currentVolume;
        this.currentChapter = currentChapter;
        this.user = user;
        this.manga = manga;
        this.volume = volume;
        this.chapter = chapter;
    }
}

export default ongoing;