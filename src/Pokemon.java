public class Pokemon extends Personaje {
    
    private String tipo; 
    private Habilidad habilidad; 
    private int hp;
    private boolean esLegendario; 
    private String debilContra;
    private String fuerteContra;
    private int fuerza;
    private int velocidad;
    /* priavate
    tipo string
    habilidad- habilidad
   hp - int
   esLegendario - boolean
   debilCoantra - string
   fuerte Contra - string
*/

    public String getTipo() {
        return tipo;}
    public void setTipo(String tipo) {
        this.tipo = tipo;}

    public int getHp() {
        return hp;}
    public void setHp(int hp) {
        this.hp = hp;}

    public boolean isEsLegendario() {
        return esLegendario;}
    public void setEsLegendario(boolean esLegendario) {
        this.esLegendario = esLegendario;}

    public String getDebilContra() {
        return debilContra;}
    public void setDebilContra(String debilContra) {
        this.debilContra = debilContra;}

    public String getFuerteContra() {
        return fuerteContra;}
    public void setFuerteContra(String fuerteContra) {
        this.fuerteContra = fuerteContra;}

    public Habilidad getHabilidad() {
        return habilidad;}
    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;}

    public int getFuerza() {
        return fuerza;}
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;}

    public int getVelocidad() {
        return velocidad;}
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;}

    public Pokemon(String nombre, int nivel, char genero, String tipo, Habilidad habilidad, int hp, boolean esLegendario, String debilContra, String fuerteContra, int fuerza, int velocidad) {
        super(nombre, nivel, genero);
        this.tipo = tipo;
        this.habilidad = habilidad;
        this.hp = hp;
        this.esLegendario = esLegendario;
        this.debilContra = debilContra;
        this.fuerteContra = fuerteContra;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
    }



    @Override
    public boolean pelear(Pokemon pokemonOpuesto) {
      /* int ataque;
        if(pokemon.fuerteContra ==pokemon.tipo){
            this.habilidad.getAtaqueBase();
            pokemon.getHabilidad().getNombre();
        }else if (pokemon.getFuerteContra().equals("")){//fuerte
             ataque=20;
            this.habilidad.getAtaqueBase();//+20
            double v = pokemon.getHp() - Math.random();
        } else if (pokemon.getDebilContra().equals("fuego")){//debil
            ataque=-20;
            this.habilidad.getAtaqueBase();//-20
        }
        do{
        if(pokemon.hp>pokemon.getHp()){
            Math.random();
            pokemon.getHabilidad().getAtaqueBase();
            pokemon.setHp(this.getHp()+20);
            this.setHp(this.getHp()-20);
        }
        return false;
    }while (pokemon.getHp()<0);*/

        if(this.fuerteContra.equals(pokemonOpuesto.getTipo())){
            this.habilidad.setAtaqueBase(this.habilidad.getAtaqueBase()+30);
            pokemonOpuesto.getHabilidad().setAtaqueBase(pokemonOpuesto.getHabilidad().getAtaqueBase()-20);

        }else if (pokemonOpuesto.getFuerteContra().equals(this.tipo)){
            this.habilidad.setAtaqueBase(this.habilidad.getAtaqueBase()-30);
            pokemonOpuesto.getHabilidad().setAtaqueBase(pokemonOpuesto.getHabilidad().getAtaqueBase()+20);

        }else {}
        do {
            if (this.velocidad >= pokemonOpuesto.getVelocidad()) {//empiezp
                 pokemonOpuesto.setHp(pokemonOpuesto.getHp() - this.habilidad.getAtaqueBase());//golpe
                if (pokemonOpuesto.getHp() <= 0) {//gano
                    return true;
                } else {
                    this.hp -= pokemonOpuesto.getHabilidad().getAtaqueBase();
                    if (this.hp <= 0) {
                        return false;
                    }
                }
            } else {//opuesto
                this.hp -= pokemonOpuesto.getHabilidad().getAtaqueBase();
                if (this.hp <= 0) {
                    return false;
                } else {
                    pokemonOpuesto.setHp(pokemonOpuesto.getHp() - this.habilidad.getAtaqueBase());//golpe
                     if (pokemonOpuesto.getHp() <= 0) {//pierdo
                         return true;
                    }
                }
            }
        }while (true);
    }

    /*
no hacer todavia
   pelea :
   consumi pocion o baya para ataque
    habilidad.ataqueBase +20

     si (mi pokemon es fuerte contra el pokemon opuesto)
          mas ataque de habilidad
     sino(debil)
         menos ataque de habilidad
     sino(neutral)
        normal ataque

     cuando se lanza el ataque se resta la cantidad de ataque del hp




     */

    //poner to string
}
