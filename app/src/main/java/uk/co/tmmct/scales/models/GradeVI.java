package uk.co.tmmct.scales.models;

/**
 * Created by thomas on 16/07/16.
 */
public class GradeVI {
    private static final ScaleGroup similarMotionScales = new ScaleGroup.ScaleGroupBuilder()
            .WithType(ScaleType.SIMILAR_MOTION)
            .InAllKeys()
            .WithNumberOfOctaves(4)
            .Legato()
            .HandsTogetherAndSeparately()
            .Build();

    private static final KeyGroup AAndEFlatMajors = new KeyGroup.KeyGroupBuilder()
            .WithMode(Mode.MAJOR)
            .WithTonics(new Note[]{Note.A, Note.E_FLAT})
            .Build();

    private static final ScaleGroup staccatoScales = new ScaleGroup.ScaleGroupBuilder()
            .WithType(ScaleType.SIMILAR_MOTION)
            .InKeys(AAndEFlatMajors)
            .WithNumberOfOctaves(4)
            .Staccato()
            .HandsSeparately()
            .Build();

    private static final KeyGroup AAndEFlatMajorsAndHarmonicMinors = new KeyGroup.KeyGroupBuilder()
            .WithModes(new Mode[]{Mode.MAJOR, Mode.HARMONIC_MINOR})
            .WithTonics(new Note[]{Note.A, Note.E_FLAT})
            .Build();

    private static final ScaleGroup contraryMotionScales = new ScaleGroup.ScaleGroupBuilder()
            .WithType(ScaleType.CONTRARY_MOTION)
            .InKeys(AAndEFlatMajorsAndHarmonicMinors)
            .WithNumberOfOctaves(2)
            .Legato()
            .Build();

    private static final KeyGroup CMajorOnly = new KeyGroup.KeyGroupBuilder()
            .WithMode(Mode.MAJOR)
            .WithTonic(Note.C)
            .Build();

    private static final ScaleGroup staccatoScalesInThirds = new ScaleGroup.ScaleGroupBuilder()
            .WithType(ScaleType.SCALE_IN_THIRDS)
            .InKeys(CMajorOnly)
            .WithNumberOfOctaves(2)
            .Staccato()
            .HandsSeparately()
            .Build();

    private static final ScaleGroup chromaticScales = new ScaleGroup.ScaleGroupBuilder()
            .WithType(ScaleType.CHROMATIC)
            .ChromaticOnAnyNote()
            .WithNumberOfOctaves(4)
            .Legato()
            .HandsTogetherAndSeparately()
            .Build();

    private static final ScaleGroup chromaticContraryMotionScales = new ScaleGroup.ScaleGroupBuilder()
            .WithType(ScaleType.CHROMATIC_CONTRARY_MOTION) //AAAARGH need to redefine            .InAllKeys() //ugh
            .InAllKeys() //ugh
            .WithNumberOfOctaves(2)
            .Legato()
            .HandsTogetherAndSeparately()
            .Build();

    private static final ScaleGroup arpeggios = new ScaleGroup.ScaleGroupBuilder()
            .WithType(ScaleType.ARPEGGIO)
            .InAllArpeggioKeys()
            .WithNumberOfOctaves(4)
            .Legato()
            .HandsTogetherAndSeparately()
            .Build();

    private static final ScaleGroup diminishedSevenths = new ScaleGroup.ScaleGroupBuilder()
            .WithType(ScaleType.DIMINISHED_SEVENTH)
            .InAllKeys() //ugh
            //.StartingOnBAndCSharp()
            .WithNumberOfOctaves(4)
            .Legato()
            .HandsTogetherAndSeparately()
            .Build();

    private static ScaleGroup[] scaleGroups = new ScaleGroup[]{
            similarMotionScales,
            staccatoScales,
            contraryMotionScales,
            staccatoScalesInThirds,
            chromaticScales,
            chromaticContraryMotionScales,
            arpeggios,
            diminishedSevenths

    };

    public static ScaleGroup[] getScaleGroups() {
        return scaleGroups;
    }
}
