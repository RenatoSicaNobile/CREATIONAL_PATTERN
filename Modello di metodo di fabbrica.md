Modello di metodo di fabbrica

Un modello di fabbrica o un modello di metodo di fabbrica afferma che basta definire un'interfaccia o una classe astratta per creare un oggetto ma lasciare che le sottoclassi decidano quale classe istanziare. In altre parole, le sottoclassi sono responsabili della creazione dell'istanza della classe.

Il modello del metodo di fabbrica è anche noto come costruttore virtuale.

Vantaggio del modello di progettazione di fabbrica:

    - Factory Method Pattern consente alle sottoclassi di scegliere il tipo di oggetti da creare.
    - Promuove l'accoppiamento libero eliminando la necessità di associare classi specifiche dell'applicazione nel codice. Ciò significa che il codice interagisce esclusivamente con l'interfaccia risultante o la classe astratta, in modo che funzioni con qualsiasi classe che implementa quell'interfaccia o che estende quella classe astratta.

Utilizzo del modello di progettazione di fabbrica

    - Quando una classe non sa quali sottoclassi sarà necessario creare.
    - Quando una classe vuole che le sue sottoclassi specifichino gli oggetti da creare.
    - Quando le classi padre scelgono la creazione di oggetti per le sue sottoclassi.

