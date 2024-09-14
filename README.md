# Lesion-Lens


**Lesion-Lens** is an innovative Android app designed to detect skin cancer with high accuracy using advanced image analysis. Leveraging TensorFlow Lite and the InceptionResNetv2 model, Lesion-Lens aims to provide early and reliable skin cancer detection for users. 

## 🚀 Features

- **Advanced Image Analysis**: Utilizes the InceptionResNetv2 model for high-accuracy skin cancer detection.
- **Seamless Integration**: Integrates TensorFlow Lite for efficient model inference on Android devices.
- **Comprehensive Dataset**: Pretrained on the HAM10000 dataset to enhance detection capabilities.
- **User-Friendly Interface**: Developed with intuitive XML layouts to provide a smooth user experience.

## 🔧 Technologies Used

- **Android Studio**: The primary IDE for Android app development.
- **TensorFlow Lite**: For deploying machine learning models on Android.
- **Keras**: For building and training the InceptionResNetv2 model.
- **InceptionResNetv2**: A state-of-the-art model used for accurate image classification.
- **HAM10000 Dataset**: A comprehensive dataset used for training the detection model.
- **XML Layouts**: For designing the app's user interface.

## 📅 Development Timeline

- **January 2024 – April 2024**

## 🛠️ Getting Started

Follow these steps to get the app up and running:

### Prerequisites

1. **Android Studio**: Make sure you have [Android Studio](https://developer.android.com/studio) installed.
2. **Android Device or Emulator**: You'll need an Android device or emulator with at least Android 5.0 (Lollipop) or higher to run the app.
3. **TensorFlow Lite**: TensorFlow Lite dependencies are included in the project for deploying the machine learning model.
4. **Keras Model (.tflite)**: Ensure that the pre-trained TensorFlow Lite model (`.tflite` file) is available in the project.

### Installation

1. **Clone the Repository**: 
   Clone the project to your local machine by running:
   ```bash
   git clone https://github.com/shreyashdhas0604/Lesion-Lens.git

### Open the Project in Android Studio

1. **Launch Android Studio** and click on `Open an Existing Project`.
2. Navigate to the cloned project folder and open it.

### Download Required Dependencies

1. Android Studio will automatically sync the project and download all the necessary dependencies.
2. If prompted, update Gradle or any SDK components.

### Add TensorFlow Lite Model

1. Place the TensorFlow Lite model (`model.tflite`) in the `app/src/main/assets/` folder.
   - If this folder doesn't exist, create it manually.

### Build the Project

1. Click on `Build > Make Project` to build the project.
2. Make sure there are no build errors before proceeding.

### Running the App

#### Run on an Emulator or Device

1. Connect your Android device to the computer via USB, or start an Android emulator.
2. Click on `Run > Run app` in Android Studio to deploy the app on your device or emulator.

#### Using the App

1. Open the app on your Android device.
2. Capture or upload an image of the skin lesion using the app.
3. The app will analyze the image and display the skin cancer detection result based on the model's prediction.

