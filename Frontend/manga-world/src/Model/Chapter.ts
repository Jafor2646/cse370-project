import Volume from "./Volume";

class Chapter {
  cId: number;
  cNumber: number;
  cReleaseDate: Date;
  cPageCount: number;
  cView: number;
  volume: Volume;
  
  constructor(cId: number, cNumber: number, cReleaseDate: Date, cPageCount: number, cView: number, volume: Volume) {  
    this.cId = cId;
    this.cNumber = cNumber;
    this.cReleaseDate = cReleaseDate;
    this.cPageCount = cPageCount;
    this.cView = cView;
    this.volume = volume;
  }
  
}

export default Chapter;