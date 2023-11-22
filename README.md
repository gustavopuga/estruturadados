# Árvore Binária de Busca (ABB) em Java

Este projeto implementa uma Árvore Binária de Busca (ABB) em Java.

## Funcionalidades

- **Inserção:** Adiciona novos elementos à árvore mantendo a propriedade de ordenação.
- **Remoção:** Remove elementos da árvore mantendo a propriedade de ordenação.
- **Percurso (Traversals):** Oferece três tipos de percurso na árvore: em ordem (in-order), pré-ordem (pre-order) e pós-ordem (post-order).

## Uso

1. **Classe `ArvoreBinariaBusca`:** Contém a lógica principal para manipulação da árvore.
2. **Classe `No`:** Define a estrutura do nó da árvore.
3. **Classe `Main`:** Exemplo de utilização da ABB com inserção, remoção e exibição dos percursos.

### Como Utilizar

1. **Inserir um elemento na árvore:**
   
   ```java
   abb.inserir(10); // Insere o valor 10 na árvore
   ```
   
2. **Remover um elemento da árvore:**

   ```java
   abb.remover(7); // Remove o valor 7 da árvore
   ```

3. **Realizar um percurso na árvore:**

   - Em ordem:
   
     ```java
     abb.emOrdem(); // Exibe o percurso em ordem (in-order)
     ```
   
   - Pré-ordem:
   
     ```java
     abb.preOrdem(); // Exibe o percurso pré-ordem (pre-order)
     ```
   
   - Pós-ordem:
   
     ```java
     abb.posOrdem(); // Exibe o percurso pós-ordem (post-order)
     ```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues para sugestões ou problemas encontrados.

## Licença

Este projeto está sob a [Licença MIT](https://opensource.org/licenses/MIT).
