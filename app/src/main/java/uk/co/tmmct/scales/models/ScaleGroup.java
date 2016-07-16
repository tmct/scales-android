package uk.co.tmmct.scales.models;

/**
 * Created by thomas on 16/07/16.
 */
public class ScaleGroup {
    private final Hands[] hands;
    private final Key[] keys;
    private Articulation[] articulation;

    private ScaleGroup(ScaleGroupBuilder scaleGroupBuilder) {
        this.hands = scaleGroupBuilder.hands;
        this.keys = scaleGroupBuilder.keys;
        this.articulation = scaleGroupBuilder.articulation;
    }

    public Scale getRandomScale() {
        return new Scale.ScaleBuilder()
                .WithHands(hands[0])
                .WithKey(keys[0])
                .WithArticulation(Articulation.LEGATO)
                .Build();
    }

    public static class ScaleGroupBuilder {
        private Hands[] hands;
        private Key[] keys;
        private Articulation[] articulation;

        public ScaleGroupBuilder() {}

        public ScaleGroupBuilder WithHands(Hands[] hands) {
            this.hands = hands;
            return this;
        }

        public ScaleGroupBuilder WithHandsTogetherAndSeparately() {
            this.hands = new Hands[] {Hands.TOGETHER, Hands.RIGHT_ONLY, Hands.LEFT_ONLY};
            return this;
        }

        public ScaleGroupBuilder Legato() {
            this.articulation = new Articulation[] {Articulation.LEGATO};
            return this;
        }

        public ScaleGroupBuilder InEFlatMajor() {
            this.keys = new Key [] {new Key(Note.E_FLAT, Mode.MAJOR)};
            return this;
        }

        public ScaleGroup Build() {
            return new ScaleGroup(this);
        }
    }
}
