package uk.co.tmmct.scales.models;

/**
 * Created by thomas on 09/07/2016.
 */
public class Scale {
    public final Key key;
    public final Hands hands;
    public final Articulation articulation;

    public String getDescription() {
        return String.format("Scale!");
    }

    private Scale(ScaleBuilder scalebuilder) {
        this.key = scalebuilder.key;
        this.hands = scalebuilder.hands;
        this.articulation = scalebuilder.articulation;
    }

    public static class ScaleBuilder {
        private Hands hands;
        private Key key;
        private Articulation articulation;

        public ScaleBuilder() {
        }

        public ScaleBuilder WithHands(Hands hands) {
            this.hands = hands;
            return this;
        }

        public ScaleBuilder WithKey(Key key) {
            this.key = key;
            return this;
        }

        public ScaleBuilder WithArticulation(Articulation articulation) {
            this.articulation = articulation;
            return this;
        }

        public Scale Build() {
            return new Scale(this);
        }
    }
}
