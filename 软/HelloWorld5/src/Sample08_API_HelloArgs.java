import org.apache.commons.cli.*;

public class Sample08_API_HelloArgs {
    private static CommandLine commandLine;
    private static CommandLineParser parser = new DefaultParser();
    private static Options options = new Options();

    static {
        options.addOption(new Option("h","help",false,"Print help message"));
        options.addOption(new Option("s",false,"Make some side effects"));
        options.addOption(new Option("p","print",true,"Print arg"));
    }

    public static void main(String[] args){

        try {
            commandLine = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }

        System.out.println("WRONG_MESSAGE:"+commandLine.getArgs().length);
        for(String s : args)
            System.out.println(s);
    }
}
