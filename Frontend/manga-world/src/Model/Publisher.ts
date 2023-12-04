class publisher {
    pId: number;
    pName: string;
    pWebsite: string;
    pDescription: string;

    constructor(pId: number, pName: string, pWebsite: string, pDescription: string) {
        this.pId = pId;
        this.pName = pName;
        this.pWebsite = pWebsite;
        this.pDescription = pDescription;
    }
}

export default publisher;