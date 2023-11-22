# �rvore Bin�ria de Busca (ABB) em Java

Este projeto implementa uma �rvore Bin�ria de Busca (ABB) em Java.

## Funcionalidades

- **Inser��o:** Adiciona novos elementos � �rvore mantendo a propriedade de ordena��o.
- **Remo��o:** Remove elementos da �rvore mantendo a propriedade de ordena��o.
- **Percurso (Traversals):** Oferece tr�s tipos de percurso na �rvore: em ordem (in-order), pr�-ordem (pre-order) e p�s-ordem (post-order).

## Uso

1. **Classe `ArvoreBinariaBusca`:** Cont�m a l�gica principal para manipula��o da �rvore.
2. **Classe `No`:** Define a estrutura do n� da �rvore.
3. **Classe `Main`:** Exemplo de utiliza��o da ABB com inser��o, remo��o e exibi��o dos percursos.

### Como Utilizar

1. **Inserir um elemento na �rvore:**
   
   ```java
   abb.inserir(10); // Insere o valor 10 na �rvore
   ```
   
2. **Remover um elemento da �rvore:**

   ```java
   abb.remover(7); // Remove o valor 7 da �rvore
   ```

3. **Realizar um percurso na �rvore:**

   - Em ordem:
   
     ```java
     abb.emOrdem(); // Exibe o percurso em ordem (in-order)
     ```
   
   - Pr�-ordem:
   
     ```java
     abb.preOrdem(); // Exibe o percurso pr�-ordem (pre-order)
     ```
   
   - P�s-ordem:
   
     ```java
     abb.posOrdem(); // Exibe o percurso p�s-ordem (post-order)
     ```

## Contribui��o

Contribui��es s�o bem-vindas! Sinta-se � vontade para abrir issues para sugest�es ou problemas encontrados.

## Licen�a

Este projeto est� sob a [Licen�a MIT](https://opensource.org/licenses/MIT).
