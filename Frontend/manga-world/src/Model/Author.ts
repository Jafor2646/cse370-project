class Author {
    aId: number;
    aName: string;
    aWebsite: string;
    aDescription: string;

    constructor(aId: number, aName: string, aWebsite: string, aDescription: string) {
        this.aId = aId;
        this.aName = aName;
        this.aWebsite = aWebsite;
        this.aDescription = aDescription;
    }
}

export default Author;