package uk.co.tmmct.scales.models;

/**
 * Created by thomas on 16/07/16.
 */
public class ScaleGroup {
    private final Hands[] hands;
    private final KeyGroup keyGroup;
    private final Articulation[] articulation;
    private final ScaleType scaleType;
    private final int numberOfOctaves;

    private ScaleGroup(ScaleGroupBuilder scaleGroupBuilder) {
        this.hands = scaleGroupBuilder.hands;
        this.keyGroup = scaleGroupBuilder.keyGroup;
        this.articulation = scaleGroupBuilder.articulation;
        this.scaleType = scaleGroupBuilder.scaleType;
        this.numberOfOctaves = scaleGroupBuilder.numberOfOctaves;
    }

    public Scale getRandomScale() {
        return new Scale.ScaleBuilder()
                .WithHands(hands[0])
                .WithKey(keyGroup.getRandomKey())
                .WithArticulation(Articulation.LEGATO)
                .Build();
    }

    public static class ScaleGroupBuilder {
        private Hands[] hands = new Hands[] {Hands.NOT_APPLICABLE};
        private KeyGroup keyGroup;
        private Articulation[] articulation;
        private ScaleType scaleType;
        private int numberOfOctaves;

        public ScaleGroupBuilder() {}

        public ScaleGroupBuilder WithHands(Hands[] hands) {
            this.hands = hands;
            return this;
        }

        public ScaleGroupBuilder HandsTogetherAndSeparately() {
            this.hands = new Hands[] {Hands.TOGETHER, Hands.RIGHT_ONLY, Hands.LEFT_ONLY};
            return this;
        }

        public ScaleGroupBuilder Legato() {
            this.articulation = new Articulation[] {Articulation.LEGATO};
            return this;
        }

        public ScaleGroupBuilder Staccato() {
            this.articulation = new Articulation[] {Articulation.STACCATO};
            return this;
        }

        public ScaleGroupBuilder WithType(ScaleType scaleType) {
            this.scaleType = scaleType;
            return this;
        }

        public ScaleGroupBuilder WithNumberOfOctaves(int numberOfOctaves) {
            this.numberOfOctaves = numberOfOctaves;
            return this;
        }

        public ScaleGroupBuilder InAllKeys() {
            this.keyGroup = KeyGroup.AllKeys;
            return this;
        }

        public ScaleGroupBuilder HandsSeparately() {
            this.hands = Hands.Separately;
            return this;
        }

        public ScaleGroupBuilder InKeys(KeyGroup keyGroup) {
            this.keyGroup = keyGroup;
            return this;
        }

        public ScaleGroupBuilder InAllArpeggioKeys() {
            this.keyGroup = KeyGroup.AllArpeggioKeys;
            return this;
        }

        public ScaleGroupBuilder ChromaticOnAnyNote() {
            this.keyGroup = new KeyGroup.KeyGroupBuilder()
                    .WithMode(Mode.CHROMATIC)
                    .WithAllTonics()
                    .Build();
            return this;
        }

        public ScaleGroup Build() {
            return new ScaleGroup(this);
        }
    }
}
