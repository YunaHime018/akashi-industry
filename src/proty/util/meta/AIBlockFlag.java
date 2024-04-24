package proty.util.meta;

public enum AIBlockFlag {
    railgunTurret;

    public final static AIBlockFlag[] all = values();

    /** Values for logic only. Filters out some internal flags. */
    public final static AIBlockFlag[] allLogic = {railgunTurret};
}
