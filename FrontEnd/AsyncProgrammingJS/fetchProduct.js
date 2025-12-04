

async function fetchProducts() {
  const url = "https://fakestoreapi.com/products";
  try {
    
    const response = await fetch(url);
    if (!response.ok) throw new Error(`HTTP ${response.status}`);
    const products = await response.json();
    products.forEach((p) => {
      console.log(`Product: ${p.title}`);
      console.log(`Price: $${p.price}`);
      console.log(`Image: ${p.image}`);
      console.log("---------------------------");
    });

 
    if (typeof document !== "undefined") {
      const container = document.createElement("div");
      container.style.display = "grid";
      container.style.gridTemplateColumns = "repeat(auto-fill,minmax(220px,1fr))";
      container.style.gap = "12px";
      products.forEach((p) => {
        const card = document.createElement("div");
        card.style.border = "1px solid #ddd";
        card.style.padding = "8px";
        card.style.borderRadius = "6px";

        const img = document.createElement("img");
        img.src = p.image;
        img.alt = p.title;
        img.width = 150;
        card.appendChild(img);

        const title = document.createElement("h4");
        title.textContent = p.title;
        card.appendChild(title);

        const price = document.createElement("p");
        price.textContent = `$${p.price}`;
        card.appendChild(price);

        container.appendChild(card);
      });
      document.body.appendChild(container);
    }
  } catch (err) {
    console.error("Failed to load products. Please try again.");
    console.error("Details:", err.message);
  }
}

// Run
fetchProducts();
