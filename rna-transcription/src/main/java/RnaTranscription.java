class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rnaStrand = new StringBuilder();
        char transcribed;

        for (int i = 0; i < dnaStrand.length(); i++) {
            switch (dnaStrand.charAt(i)) {
                case 'G':
                    transcribed = 'C';
                    break;
                case 'C':
                    transcribed = 'G';
                    break;
                case 'T':
                    transcribed = 'A';
                    break;
                case 'A':
                    transcribed = 'U';
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            rnaStrand.append(transcribed);
        }

        return rnaStrand.toString();
    }

}
