/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;


/**
 *
 * @author FraNko
 */
public class Pronostico {

    private Partido partido; // Este es el partido en el que se apuesta.
    private Equipo equipo; // Seria el equipo que la persona cree que va a ganar.
    private ResultadoEnum resultado; // Aca va el resultado que dice la persona.
    // (partido1, eq1 , empatar)
    
    public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultado) {
    	this.partido=partido;
    	this.equipo=equipo;
    	this.resultado=resultado;
    }
    public Partido getPartido() {
		return partido;
	}
	public Equipo getEquipo() {
		return equipo;
	}

	public ResultadoEnum getResultado() {
		return resultado;
	}

	public int puntos() {
        int punto = 0;
        if (resultado == partido.resultado(equipo)) {
            punto += 1;
        }
        return punto;
    }

}
