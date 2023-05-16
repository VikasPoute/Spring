<!DOCTYPE html>
<html>

<head>
  <title>Image Upload Template</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <style>
    body {
      background-color: #f8f9fa;
    }

    .card-wrapper {
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }

    .card {
      width: 400px;
      border: none;
      border-radius: 10px;
      box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
    }

    .card-header {
      background-color: #007bff;
      color: #fff;
      text-align: center;
      font-size: 24px;
      padding: 20px;
      border-radius: 10px 10px 0 0;
    }

    .card-body {
      padding: 20px;
    }

    .form-group label {
      font-weight: bold;
    }

    .btn-primary {
      width: 100%;
    }
  </style>
</head>

<body>
  <div class="card-wrapper">
    <div class="card">
      <div class="card-header">
        Image Upload
      </div>
      <div class="card-body">
        <form action="upload-image" method="post" enctype="multipart/form-data">
          <div class="form-group">
            <label for="image">Choose Image:</label>
            <input type="file" class="form-control-file" id="file" name="image" accept="image/*">
          </div>
          <button type="submit" class="btn btn-primary">Upload</button>
        </form>
      </div>
    </div>
  </div>

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>

</html>