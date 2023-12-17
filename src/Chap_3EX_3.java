public class Chap_3EX_3 {
    /* WAP to fill in a letter template which looks like below
               LETTER = "Dear <| NAME |>, thanks a lot."
               replace <| NAME |> with a string (name).
     */
    public static void main(String[] args) {
        String ltr = "Dear <|NAME|>, thanks a lot.";
        System.out.print(ltr.replace("<|NAME|>", "sobu"));
    }
}
