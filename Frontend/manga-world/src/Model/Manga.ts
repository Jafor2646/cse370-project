class Manga {
  mId: number;
  mTitle: string;
  mPublishDate: Date;
  mView: number;
  mDescription: string;

  constructor(mId: number, mTitle: string, mPublishDate: Date, mView: number, mDescription: string) {
      this.mId = mId;
      this.mTitle = mTitle;
      this.mPublishDate = mPublishDate;
      this.mView = mView;
      this.mDescription = mDescription;
  }
}
export default Manga;
