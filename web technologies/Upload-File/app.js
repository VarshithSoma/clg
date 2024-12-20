const express = require("express");
const multer = require("multer");
const path = require("path");
const app = express();
const port = 3000;

const storage = multer.diskStorage({
  destination: (req, file, cb) => {
    cb(null, "uploads/"); // Directory where files will be saved
  },
  filename: (req, file, cb) => {
    cb(null, Date.now() + path.extname(file.originalname)); // File name
  },
});

const upload = multer({ storage });
app.get("/", (req, res) => {
  res.send(`
        <form action="/upload" method="POST">
            <input type="file" name="file" />
            <button type="submit">Upload</button>
        </form>
    `);
});
app.post("/upload", upload.single("file"), (req, res) => {
  if (!req.file) {
    return res.status(400).send("No file uploaded.");
  }
  res.send(`File uploaded successfully: ${req.file.filename}`);
});

app.listen(port, () => {
  console.log(`Server running at http://localhost:${port}`);
});
