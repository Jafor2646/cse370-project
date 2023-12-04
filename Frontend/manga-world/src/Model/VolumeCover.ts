import Volume from "./Volume";

class volumeCover {
  vcId: number;
  vcPicture: string;
  volume: Volume;

  constructor(vcId: number, vcPicture: string, volume: Volume) {
    this.vcId = vcId;
    this.vcPicture = vcPicture;
    this.volume = volume;
  }
}
export default volumeCover; 