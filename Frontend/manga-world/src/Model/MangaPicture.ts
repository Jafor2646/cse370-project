import Manga from "./Manga";

class MangaPicture {
  mpId: number;
  picture: string;
  manga: Manga;

  constructor(mpId: number, picture: string, manga: Manga) {
    this.mpId = mpId;
    this.picture = picture;
    this.manga = manga;
  }
}

export default MangaPicture;