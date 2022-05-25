

public class GameBoard {
    Space spaces[];
    String spacesText[];

    public GameBoard(){
        spaces = new Space[42];


        for(int i = 0; i < spaces.length; i++){
            spaces[i] = Space.EMPTY;
        }

        spacesText = new String[42];

        for(int i = 0; i < spacesText.length; i++){
            spacesText[0] = "00";
            spacesText[1] = "01";
            spacesText[2] = "02";
            spacesText[3] = "03";
            spacesText[4] = "04";
            spacesText[5] = "05";
            spacesText[6] = "06";
            spacesText[7] = "07";
            spacesText[8] = "08";
            spacesText[9] = "09";
            spacesText[10] = "10";
            spacesText[11] = "11";
            spacesText[12] = "12";
            spacesText[13] = "13";
            spacesText[14] = "14";
            spacesText[15] = "15";
            spacesText[16] = "16";
            spacesText[17] = "17";
            spacesText[18] = "18";
            spacesText[19] = "19";
            spacesText[20] = "20";
            spacesText[21] = "21";
            spacesText[22] = "22";
            spacesText[23] = "23";
            spacesText[24] = "24";
            spacesText[25] = "25";
            spacesText[26] = "26";
            spacesText[27] = "27";
            spacesText[28] = "28";
            spacesText[29] = "29";
            spacesText[30] = "30";
            spacesText[31] = "31";
            spacesText[32] = "32";
            spacesText[33] = "33";
            spacesText[34] = "34";
            spacesText[35] = "35";
            spacesText[36] = "36";
            spacesText[37] = "37";
            spacesText[38] = "38";
            spacesText[39] = "39";
            spacesText[40] = "40";
            spacesText[41] = "41";
        }

    }

    public void PlaceOnBoard(Space pieceToPlace, int locationToPlace){

        if(spaces[locationToPlace] == Space.EMPTY){
            spaces[locationToPlace] = pieceToPlace;
            if(pieceToPlace == Space.GREEN){
                spacesText[locationToPlace] = ".G";
            }
            else{
                spacesText[locationToPlace] = ".W";
            }

        }
    }

    public void Draw(){
        System.out.println("");
        System.out.println(" " + spacesText[0] + " | " + spacesText[1] + " | " + spacesText[2] + " | " + spacesText[3] + " | " + spacesText[4] + " | " + spacesText[5] + " | " + spacesText[6]);
        System.out.println("----|----|----|----|----|----|----");
        System.out.println(" " + spacesText[7] + " | " + spacesText[8] + " | " + spacesText[9] + " | " + spacesText[10] + " | " + spacesText[11] + " | " + spacesText[12] + " | " + spacesText[13]);
        System.out.println("----|----|----|----|----|----|----");
        System.out.println(" " + spacesText[14] + " | " + spacesText[15] + " | " + spacesText[16] + " | " + spacesText[17] + " | " + spacesText[18] + " | " + spacesText[19] + " | " + spacesText[20]);
        System.out.println("----|----|----|----|----|----|----");
        System.out.println(" " + spacesText[21] + " | " + spacesText[22] + " | " + spacesText[23] + " | " + spacesText[24] + " | " + spacesText[25] + " | " + spacesText[26] + " | " + spacesText[27]);
        System.out.println("----|----|----|----|----|----|----");
        System.out.println(" " + spacesText[28] + " | " + spacesText[29] + " | " + spacesText[30] + " | " + spacesText[31] + " | " + spacesText[32] + " | " + spacesText[33] + " | " + spacesText[34]);
        System.out.println("----|----|----|----|----|----|----");
        System.out.println(" " + spacesText[35] + " | " + spacesText[36] + " | " + spacesText[37] + " | " + spacesText[38] + " | " + spacesText[39] + " | " + spacesText[40] + " | " + spacesText[41]);
        System.out.println("");
    }
}

