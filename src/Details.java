import espacoDeEstados.Puzzle8;

public class Details {

	public void details() {
//		 profundidade tem que setar o limite
//			char[] cfgIni = {' ','2','3','1','4','6','7','5','8'}; // PL
			char[] cfgIni = {'2','4','3','7','1','6','5',' ','8'}; 
//			char[] cfgIni = {'2','3',' ','7','4','1','5','8','6'};
			//char[] cfgIni = {'7','2','3','4',' ','1','5','8','6'}; // OutOfMemory

			char[] cfgFim = {'1', '2', '3', '4', '5', '6', ' ', '7', '8'};
			
			Puzzle8 puzzleInicial = new Puzzle8();
			puzzleInicial.setEstado(cfgIni);
			puzzleInicial.setCusto(0);
			puzzleInicial.setAvaliacao( puzzleInicial.heuristica(Puzzle8.TABULEIRO_ORGANIZADO) );
				
			Puzzle8 puzzleFinal = new Puzzle8();
//			puzzleFinal.setEstado( Puzzle8.TABULEIRO_ORGANIZADO );
			puzzleFinal.setEstado( cfgFim );
			puzzleFinal.setCusto(0);
			puzzleFinal.setAvaliacao(0);
			
			
//			return new char[] {puzzleInicial, puzzleFinal}.toString();
			
	}
}
