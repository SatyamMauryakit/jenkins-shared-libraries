// This file contains reusable pipeline functions for Code, Build, Test, Deploy stages

def call() {
    echo "🚀 pipelineUtils.groovy loaded successfully!"
}

/**
 * Prints a welcome message
 */
def hello() {
    echo "👋 Hello from Shared Library function!"
}

/**
 * Stage: Code Checkout
 */
def checkoutCode(String repo = "https://github.com/LondheShubham153/django-notes-app.git", String branch = "main") {
    echo "📥 Starting code checkout..."
    echo "Repository: ${repo}"
    echo "Branch: ${branch}"
    // Example for real checkout:
    // git url: repo, branch: branch
    echo "✅ Code checkout successful"
}

/**
 * Stage: Build
 */
def buildApp() {
    echo "🔨 Starting build process..."
    echo "Installing dependencies..."
    echo "✅ Build successful"
}

/**
 * Stage: Run Tests
 */
def testApp() {
    echo "🧪 Running unit tests..."
    echo "Simulating pytest / Django test run..."
    echo "✅ All tests passed successfully"
}

/**
 * Stage: Deploy
 */
def deployApp(String env = "dev") {
    echo "🚀 Deploying application..."
    echo "Target Environment: ${env}"
    echo "Simulating deployment process..."
    echo "✅ Deployment completed successfully in ${env} environment"
}

/**
 * Utility: Print pipeline summary
 */
def summary(String status = "SUCCESS") {
    echo "📊 Pipeline Summary"
    echo "--------------------------------"
    echo " Code Checkout : DONE"
    echo " Build         : DONE"
    echo " Test          : DONE"
    echo " Deploy        : DONE"
    echo " Status        : ${status}"
    echo "--------------------------------"
}
