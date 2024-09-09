
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.IntStream;


class MaiorePosicao1080 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        List<Integer> valores = new ArrayList<>();
        
        for(int i=0;i<5;++i){
            
            valores.add(input.nextInt());
        }
        
        Map<Integer,Integer> resultado = getMaiorPosicao(valores);
        
        Integer index=0;
        Integer valor=0;
        
        for(Entry<Integer,Integer>entry:resultado.entrySet()){
            
            index = entry.getKey() +1;
            valor=entry.getValue();
        }
        
        System.out.printf("%d\n%d\n",valor,index);
        
    }

 public static  Map<Integer,Integer> getMaiorPosicao(List<Integer> valores) {
     
     
     Map<Integer,Integer>resultado = new HashMap<>();
     
     Integer maxIndex = IntStream.range(0,valores.size()).boxed().max(Comparator.comparing(valores::get)).get();
     
     resultado.put(maxIndex,valores.get(maxIndex));
     
     return resultado;
        
    }
    
}
