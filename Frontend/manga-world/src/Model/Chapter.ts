import volume from "./Volume";

class chapter {
  cId: number;
  cNumber: number;
  cReleaseDate: Date;
  cPageCount: number;
  cView: number;
  volume: volume;
  
  constructor(cId: number, cNumber: number, cReleaseDate: Date, cPageCount: number, cView: number, volume: volume) {  
    this.cId = cId;
    this.cNumber = cNumber;
    this.cReleaseDate = cReleaseDate;
    this.cPageCount = cPageCount;
    this.cView = cView;
    this.volume = volume;
  }
  
}

export default chapter;