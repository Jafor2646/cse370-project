import chapter from "./Chapter";

class chapterCover {
  ccId: number;
  ccPicture: string;
  chapter: chapter;

  constructor(ccId: number, ccPicture: string, chapter: chapter) {
    this.ccId = ccId;
    this.ccPicture = ccPicture;
    this.chapter = chapter;
  }
}

export default chapterCover;