# Comandos git e linguagem de programação Java

##  Linguagem de programação Java

### Estruturas de decisão

```Java
public static void main(String[] args){
    if((i === 10 ) && (c === 'a')) {
        System.out.println("Estruturas if e equals");
    }

    if(s == "if-else") {
        System.out.println("Estrutura if-else");
    } else {
        System.out.println("Estrutura if-else");
    }

    System.out.println((valor1 > valor2 ? "Valor 1 é maior" : "2 é maior"));

    int switch = 0;

    switch (valor) {
        case 1:
            System.out.println("Valor = 1");
        case 2:
            System.out.println("Valor = 2");
        default:
            System.out.println("Valor não é nenhum dos casos");
    }
}
```

### Métodos da classe *String*

```Java
public static void main(String[] args) {
    String str1 = "abc";
    
    //Str1 pode ser escrito igualmento como em str2:
    char data[] = {'a', 'b', 'c'};
    String str2 = new String(data);
    
    System.out.println("abc");
    String cde = "cde";

    System.out.println("abc" + cde);
    String c = "abc".substring(2,3);
    String d = cde.substring(1, 2);

    String s = "string"; 
    s = s.concat("! vai ser concatenada com concat."); 
    System.out.println(s); 
    System.out.println("Comprimento da String é: " + s.length());

    String split = "Split@String"; 
    String[] arrOfStr = str.split("@");
}
```

### Interação com o usuário

## Comandos git

### Fluxo de trabalho usando ramos

```Shell
git checkout master
git branch
git merge decisao
git branch -d decisao
```

```Shell
git checkout master
git branch
git merge --no-commit string
git branch -d string
```
