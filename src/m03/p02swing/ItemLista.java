
package m03.p02swing;

/**
 *
 * @author balsamiq
 */
public class ItemLista {
    private Integer cod;

    public ItemLista(Integer cod) {
        this.cod = cod;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "" + cod ;
    }
//   (\_(\
// =( °w° )=
//   )   ( //
//  (__ __)/
// balsamiq
}
