# Análise de Caixa Branca

## 1. Cálculo da Complexidade Ciclomática

* Arestas (E): 12
* Nós (N): 11 
* Metódos (P):2
  
**CÁLCULO:**
$V(G) = (12 - 11) + (2 * 2)$
$V(G) = 1 + 4 = 5$

**Conclusão:** A complexidade ciclomática total é **5**.

---

## 2. Conjunto de Caminhos Básicos

Os 5 caminhos básicos (V(G)=5) para a classe são:

* **CAMINHO 1** = 1 &rarr; 2 &rarr; 4
    *(Representa `conectarBD` com sucesso)*

* **CAMINHO 2** = 1 &rarr; 3 &rarr; 4
    *(Representa `conectarBD` com falha/exceção)*

* **CAMINHO 3** = 5 &rarr; 6 &rarr; 7 &rarr; 10 &rarr; 11
    *(Representa `verificarUsuario` com uma exceção no Nó 7, ex: `conn` nula)*

* **CAMINHO 4** = 5 &rarr; 6 &rarr; 7 &rarr; 8 &rarr; 11
    *(Representa `verificarUsuario` com login falho, onde o `if` (Nó 8) é falso)*

* **CAMINHO 5** = 5 &rarr; 6 &rarr; 7 &rarr; 8 &rarr; 9 &rarr; 11
    *(Representa `verificarUsuario` com login bem-sucedido, onde o `if` (Nó 8) é verdadeiro)*
