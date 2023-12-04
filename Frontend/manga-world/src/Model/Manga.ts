class Manga {
  mid: number;
  mtitle: string;
  mpublishDate: Date;
  mview: number;
  mdescription: string;

    constructor(mid: number, mtitle: string, mpublishDate: Date, mview: number, mdescription: string) {
        this.mid = mid;
        this.mtitle = mtitle;
        this.mpublishDate = mpublishDate;
        this.mview = mview;
        this.mdescription = mdescription;
    }
}
export default Manga;
