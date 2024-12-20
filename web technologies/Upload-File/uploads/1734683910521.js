const express = require('express');
const multer = require('multer');
const path = require('path');

const app = express();
const port = 3000;

// Set storage options for Multer
const storage = multer.diskStorage({
    destination: (req, file, cb) => {
        cb(null, 'uploads/'); // Directory where files will be saved
    },
    filename: (req, file, cb) => {
        cb(null, Date.now() + path.extname(file.originalname)); // File name
    },
});

// Initialize Multer with storage options
const upload = multer({ 
    storage: storage,
    limits: { fileSize: 5 * 1024 * 1024 }, // Limit file size to 5MB
});

// Serve a simple HTML form
app.get('/', (req, res) => {
    res.send(`
        <form action="/upload" method="POST" enctype="multipart/form-data">
            <input type="file" name="file" />
            <button type="submit">Upload</button>
        </form>
    `);
});

// Route for file upload
app.post('/upload', upload.single('file'), (req, res) => {
    if (!req.file) {
        return res.status(400).send('No file uploaded.');
    }
    res.send(`File uploaded successfully: ${req.file.filename}`);
});

// Start the server
app.listen(port, () => {
    console.log(`Server running at http://localhost:${port}`);
});
