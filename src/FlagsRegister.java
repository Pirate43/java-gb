public class FlagsRegister extends Register {

    public enum FlagIndex {
        Z,
        N,
        H,
        C
    }

    FlagsRegister(String regName, int regSize, int regVal) {
        super(regName, regSize, regVal);
    }

    public boolean readZ() {
        return readBit(FlagIndex.Z.ordinal());
    }
    public void setZ() {
        writeBit(FlagIndex.Z.ordinal(), true);
    }
    public void clearZ() {
        writeBit(FlagIndex.Z.ordinal() ,false);
    }

    public boolean readN() {
        return readBit(FlagIndex.N.ordinal());
    }
    public void setN() {
        writeBit(FlagIndex.N.ordinal(), true);
    }
    public void clearN() {
        writeBit(FlagIndex.N.ordinal(), false);
    }

    public boolean readH() {
        return readBit(FlagIndex.H.ordinal());
    }
    public void setH() {
        writeBit(FlagIndex.H.ordinal(), true);
    }
    public void clearH() {
        writeBit(FlagIndex.H.ordinal(), false);
    }

    public boolean readC() {
        return readBit(FlagIndex.C.ordinal());
    }
    public void setC() {
        writeBit(FlagIndex.C.ordinal(), true);
    }
    public void clearC() {
        writeBit(FlagIndex.C.ordinal(), false);
    }

}
