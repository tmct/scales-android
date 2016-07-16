package uk.co.tmmct.scales.models;

/**
 * Created by thomas on 16/07/16.
 */
public class KeyGroup {
    public final Mode[] modes;
    public final Note[] tonics;

    public Key getRandomKey() {
        return new Key(tonics[0], modes[0]);
    }

    private KeyGroup(KeyGroupBuilder keyGroupBuilder) {
        this.modes = keyGroupBuilder.modes;
        this.tonics = keyGroupBuilder.tonics;
    }

    public static KeyGroup AllKeys =
            new KeyGroupBuilder()
                    .WithModes(Mode.AllScaleModes)
                    .WithTonics(Note.AllStartingNotes)
                    .Build();

    public static KeyGroup AllArpeggioKeys =
            new KeyGroupBuilder()
                    .WithModes(Mode.AllArpeggioModes)
                    .WithTonics(Note.AllStartingNotes)
                    .Build();

    public static class KeyGroupBuilder {
        private Mode[] modes;
        private Note[] tonics;

        public KeyGroupBuilder WithModes(Mode[] modes) {
            this.modes = modes;
            return this;
        }

        public KeyGroupBuilder WithMode(Mode mode) {
            this.modes = new Mode[] {mode};
            return this;
        }

        public KeyGroupBuilder WithTonics(Note[] tonics) {
            this.tonics = tonics;
            return this;
        }

        public KeyGroupBuilder WithTonic(Note note) {
            this.tonics = new Note[] {note};
            return this;
        }

        public KeyGroupBuilder WithAllTonics() {
            this.tonics = Note.AllStartingNotes;
            return this;
        }

        public KeyGroup Build() {
            return new KeyGroup(this);
        }
    }
}
